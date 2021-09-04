<?php

$dbLink = "db";
$user = "root";
$passwd = "root";
$dbName = "setup_db";
$mysqli = new mysqli($dbLink, $user, $passwd, $dbName);

$sql = 'SELECT * FROM persons';
$persons = array();
if ($result = $mysqli->query($sql)) {
    while ($data = $result->fetch_object()) {
        $persons[] = $data;
    }
}

echo "<h3>List persons</h3>";
foreach ($persons as $user) {
    echo "<p>";
    echo $user->names . " " . $user->surnames;
    echo "<p>";
}
