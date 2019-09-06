use planet_db;

CREATE TABLE exoplanets (
	planetName varchar(50),
	starName varchar(50),
	publicationStatus varchar(100),
	yearDiscovered varchar(20),
	mass varchar(50),
	massErrorMin varchar(50),
	massErrorMax varchar(50),
	radius varchar(50),
	radiusErrorMin varchar(50),
	radiusErrorMax varchar(50),
	period varchar(50),
	periodErrorMin varchar(50),
	periodErrorMax varchar(50),
	#altTargetName varchar(20),
	tempCalculated varchar(20),
	tempMeasured varchar(20),
	starDistance varchar(20),
	starDistanceErrorMin varchar(50),
	starDistanceErrorMax varchar(50),
	inclination varchar(20),
	inclinationErrorMin varchar(50)
	#inclinationErrorMax varchar(50),
	#magneticField varchar(20)
);

SELECT * FROM exoplanets LIMIT 10000;
