SELECT u.name, if(r.distance is null, 0, SUM(r.distance)) AS travelled_distance
FROM Users AS u LEFT JOIN Rides AS r
ON u.id = r.user_id
GROUP BY u.id
ORDER BY travelled_distance DESC, name
