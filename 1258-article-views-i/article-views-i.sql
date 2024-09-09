# Write your MySQL query statement below
SELECT distinct(author_id) as id FROM Views
WHERE author_id = Viewer_id order by author_id