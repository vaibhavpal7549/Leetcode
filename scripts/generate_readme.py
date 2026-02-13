import re
from pathlib import Path
from collections import defaultdict

ROOT = Path(__file__).resolve().parents[1]
README_PATH = ROOT / "README.md"

START = "<!-- AUTO-GENERATED:START -->"
END = "<!-- AUTO-GENERATED:END -->"

LEETCODE_URL_RE = re.compile(r"https?://leetcode\.com/problems/([a-z0-9\-]+)/?", re.I)
TITLE_RE = re.compile(r"<h2>\s*<a[^>]*>(.*?)</a>\s*</h2>", re.I)

def iter_problem_dirs():
    for p in ROOT.iterdir():
        if not p.is_dir():
            continue
        if p.name.startswith(".") or p.name in {"scripts", ".github"}:
            continue
        if re.match(r"^\d+[-_].+", p.name):
            yield p

def extract_problem_info(problem_dir: Path):
    readme = problem_dir / "README.md"
    if not readme.exists():
        return None

    text = readme.read_text(encoding="utf-8", errors="ignore")
    murl = LEETCODE_URL_RE.search(text)
    if not murl:
        return None

    slug = murl.group(1).lower()
    leetcode_url = f"https://leetcode.com/problems/{slug}/"

    mtitle = TITLE_RE.search(text)
    title = mtitle.group(1).strip() if mtitle else slug

    mnum = re.match(r"^(\d+)[-_].+", problem_dir.name)
    num = int(mnum.group(1)) if mnum else None

    return {
        "dir": problem_dir.name,
        "num": num,
        "title": title,
        "slug": slug,
        "leetcode_url": leetcode_url,
        "repo_url": f"./{problem_dir.name}",
    }

def infer_topic(problem):
    name = (problem["dir"] + " " + problem["title"]).lower()
    rules = [
        ("Array", ["array", "matrix", "subarray", "two sum", "3sum", "rotate", "diagonal"]),
        ("String", ["string", "palindrome", "roman", "zigzag", "prefix", "decode", "vowels"]),
        ("Linked List", ["linked list"]),
        ("Tree", ["tree", "bst", "inorder", "preorder", "postorder"]),
        ("Stack", ["stack", "parentheses", "reverse polish"]),
        ("Queue", ["queue"]),
        ("Backtracking", ["backtracking", "subsets", "n-queens", "generate parentheses"]),
        ("Binary Search", ["binary search", "peak", "search insert", "ship packages", "sqrt"]),
        ("Dynamic Programming", ["dynamic programming", "dp", "climbing stairs", "subset sum"]),
        ("Greedy", ["greedy", "assign cookies"]),
        ("Math / Bit", ["math", "bit", "digits", "gcd", "power of", "reverse bits", "counting bits"]),
        ("SQL", ["sql", "table", "employee", "views", "countries", "tweets", "products"]),
    ]
    for topic, keys in rules:
        if any(k in name for k in keys):
            return topic
    return "Other"

def render_index(problems):
    by_topic = defaultdict(list)
    for p in problems:
        by_topic[infer_topic(p)].append(p)

    lines = []
    lines.append("## LeetCode Topics")
    lines.append("")
    lines.append("> This section is auto-generated on every push to `main`.")
    lines.append("")

    for topic in sorted(by_topic.keys(), key=str.lower):
        items = by_topic[topic]
        items.sort(key=lambda x: (x["num"] is None, x["num"] if x["num"] is not None else 10**9, x["slug"]))
        lines.append(f"### {topic}")
        for p in items:
            label = f'{p["num"]:04d}-{p["slug"]}' if p["num"] is not None else p["slug"]
            lines.append(f'- [{label}]({p["repo_url"]}) — [LeetCode]({p["leetcode_url"]})')
        lines.append("")
    return "\n".join(lines).rstrip() + "\n"

def update_root_readme(index_md: str):
    if not README_PATH.exists():
        README_PATH.write_text(f"# Leetcode\n\n{START}\n{index_md}{END}\n", encoding="utf-8")
        return

    content = README_PATH.read_text(encoding="utf-8", errors="ignore")

    if START not in content or END not in content:
        new_content = content.rstrip() + "\n\n" + START + "\n" + index_md + END + "\n"
        README_PATH.write_text(new_content, encoding="utf-8")
        return

    pre = content.split(START)[0]
    post = content.split(END)[1]
    README_PATH.write_text(pre + START + "\n" + index_md + END + post, encoding="utf-8")

def main():
    problems = []
    for d in iter_problem_dirs():
        info = extract_problem_info(d)
        if info:
            problems.append(info)

    update_root_readme(render_index(problems))

if __name__ == "__main__":
    main()
