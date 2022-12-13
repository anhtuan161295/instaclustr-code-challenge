SELECT
	c.id,
	c.name,
	(
	SELECT
		count(DISTINCT(r.company)) as companies
	FROM
		reports r
	WHERE
		candidate_id = c.id ) as companies
FROM
	candidates c
order by c.id
