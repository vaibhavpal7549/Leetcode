class Node {
    int start, end;
    int sum;
    Node left, right;

    Node(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

class SegmentTree {
    Node root;

    SegmentTree(int[] nums) {
        if (nums.length > 0) {
            root = build(nums, 0, nums.length - 1);
        }
    }

    private Node build(int[] nums, int start, int end) {
        Node node = new Node(start, end);

        if (start == end) {
            node.sum = nums[start];
            return node;
        }

        int mid = start + (end - start) / 2;

        node.left = build(nums, start, mid);
        node.right = build(nums, mid + 1, end);

        node.sum = node.left.sum + node.right.sum;

        return node;
    }

    int query(Node node, int ql, int qr) {
        if (node == null)
            return 0;

        // No overlap
        if (node.end < ql || node.start > qr)
            return 0;

        // Complete overlap
        if (node.start >= ql && node.end <= qr)
            return node.sum;

        // Partial overlap
        return query(node.left, ql, qr) +
               query(node.right, ql, qr);
    }

    int update(Node node, int idx, int value) {
        if (node == null)
            return 0;

        if (idx < node.start || idx > node.end)
            return node.sum;

        if (node.start == node.end) {
            node.sum = value;
            return node.sum;
        }

        node.sum = update(node.left, idx, value) +
                   update(node.right, idx, value);

        return node.sum;
    }
}

class NumArray {

    SegmentTree tree;

    public NumArray(int[] nums) {
        tree = new SegmentTree(nums);
    }

    public void update(int index, int val) {
        tree.update(tree.root, index, val);
    }

    public int sumRange(int left, int right) {
        return tree.query(tree.root, left, right);
    }
}