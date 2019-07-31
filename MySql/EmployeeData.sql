create database swabhav;
use swabhav;
ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'root';

CREATE TABLE Contact (
	CONCTNO integer NOT NULL PRIMARY KEY,
    NAME varchar(15),
    PHONE numeric(10)
);

CREATE TABLE DEPT (
 DEPTNO              integer NOT NULL PRIMARY KEY,
 DNAME               varchar(14),
 LOC                 varchar(13)
);

INSERT INTO DEPT VALUES (10,'ACCOUNTING','NEW YORK');
INSERT INTO DEPT VALUES (20,'RESEARCH','DALLAS');
INSERT INTO DEPT VALUES (30,'SALES','CHICAGO');
INSERT INTO DEPT VALUES (40,'OPERATIONS','BOSTON');

SELECT * FROM DEPT;

DROP TABLE EMP;
CREATE TABLE EMP (
 EMPNO               integer NOT NULL PRIMARY KEY,
 ENAME               varchar(10),
 JOB                 varchar(9),
 MGR                 integer,
 HIREDATE            DATE,
 SAL                 NUMERIC CHECK(SAL>=1000 AND SAL<=50000),
 COMM                NUMERIC,
 DEPTNO              integer NOT NULL,
 CONSTRAINT EMP_FOREIGN_KEY FOREIGN KEY (DEPTNO) REFERENCES DEPT (DEPTNO),
 CONSTRAINT EMP_SELF_FOREIGN_KEY FOREIGN KEY (MGR) REFERENCES EMP (EMPNO)
);


INSERT INTO EMP VALUES (7839,'KING','PRESIDENT',NULL,'1981-11-17',5000,NULL,10);
INSERT INTO EMP VALUES (7698,'BLAKE','MANAGER',7839,'1981-03-1',2850,NULL,30);
INSERT INTO EMP VALUES (7782,'CLARK','MANAGER',7839,'1981-06-9',2450,NULL,10);
INSERT INTO EMP VALUES (7566,'JONES','MANAGER',7839,'1981-04-2',2975,NULL,20);
INSERT INTO EMP VALUES (7654,'MARTIN','SALESMAN',7698,'1981-09-28',1250,1400,30);
INSERT INTO EMP VALUES (7499,'ALLEN','SALESMAN',7698,'1981-02-20',1600,300,30);
INSERT INTO EMP VALUES (7844,'TURNER','SALESMAN',7698,'1981-09-8',1500,0,30);
INSERT INTO EMP VALUES (7900,'JAMES','CLERK',7698,'1981-12-3',9500,NULL,30);
INSERT INTO EMP VALUES (7521,'WARD','SALESMAN',7698,'1981-02-22',1250,500,30);
INSERT INTO EMP VALUES (7902,'FORD','ANALYST',7566,'1981-12-3',3000,NULL,20);
INSERT INTO EMP VALUES (7369,'SMITH','CLERK',7902,'1981-12-17',8000,NULL,20);
INSERT INTO EMP VALUES (7788,'SCOTT','ANALYST',7566,'1981-12-9',3000,NULL,20);
INSERT INTO EMP VALUES (7876,'ADAMS','CLERK',7788,'1983-01-5',1100,NULL,20);
INSERT INTO EMP VALUES (7934,'MILLER','CLERK',7782,'1982-01-23',1300,NULL,10);

SELECT * FROM EMP;

SELECT ENAME FROM EMP WHERE (DEPTNO = 10 OR DEPTNO = 20);

SELECT * FROM EMP WHERE (JOB = 'MANAGER');

SELECT * FROM EMP WHERE (DEPTNO = 10 AND JOB = 'MANAGER');

SELECT * FROM EMP WHERE (COMM IS NULL);

SELECT ENAME,((SAL + COALESCE(COMM, 0))*12) AS 'ANNUAL CTC' FROM EMP;

SELECT * FROM EMP WHERE SAL BETWEEN 2000 AND 5000;

SELECT LOWER(ENAME) AS 'EMP NAME' FROM EMP 

SELECT DISTINCT DEPTNO FROM EMP;

SELECT ENAME, DATEDIFF(YEAR, HIREDATE, GETDATE()) AS 'EXPERIENCE YEARS' FROM EMP ORDER BY 'EXPERIENCE YEARS' DESC;

SELECT TOP (3) ENAME,SAL,JOB,DEPTNO FROM EMP ORDER BY SAL DESC;

SELECT ENAME,JOB,DEPTNO 
FROM EMP 
WHERE DEPTNO=(SELECT DEPTNO 
      FROM EMP WHERE ENAME = 'SCOTT');

SELECT * FROM EMP WHERE JOB=(SELECT JOB FROM EMP WHERE ENAME='BLAKE');

SELECT COUNT(*) AS 'NUMBER OF ROW' FROM EMP;

SELECT MIN(SAL) AS 'MINIMUM SALARY', MAX(SAL) AS 'MAXIMUM SALARY', AVG(SAL) AS 'AVARAGE SALARY' FROM EMP;

SELECT * FROM EMP WHERE MGR = 7839;

SELECT e.ENAME, e.JOB, d.DNAME, d.LOC FROM EMP AS e INNER JOIN DEPT AS d ON e.DEPTNO = d.DEPTNO;

SELECT AVG(SAL), ENAME FROM EMP;

SELECT e.JOB,e.DEPTNO,d.DNAME,COUNT(*) AS TOTAL 
FROM EMP AS e INNER JOIN DEPT AS d 
ON e.DEPTNO = d.DEPTNO
WHERE (e.DEPTNO = 10 OR e.DEPTNO = 20)
GROUP BY e.JOB,e.DEPTNO,d.DNAME
HAVING COUNT(*)>1
ORDER BY COUNT(*) DESC;

SELECT T1.ENAME, T2.ENAME 
AS BOSS 
FROM EMP AS T1 LEFT JOIN EMP AS T2
ON T1.MGR = T2.EMPNO;

SELECT T1.ENAME, T2.ENAME AS MANAGER, T3.DNAME 
FROM (EMP AS T1 LEFT JOIN EMP AS T2
ON T1.MGR = T2.EMPNO) INNER JOIN DEPT AS T3 
ON T1.DEPTNO = T3.DEPTNO;
----------------------------------------------------------------------------------------------------
CREATE TABLE FOO(
	Money numeric
);

CREATE TABLE BOO(
	ID int
);

START TRANSACTION;
	INSERT INTO FOO VALUES(100);
	INSERT INTO FOO VALUES(200);
	SELECT * FROM FOO;
ROLLBACK;
SELECT * FROM FOO;

START TRANSACTION;
	BEGIN TRY
		INSERT INTO FOO VALUES(100);
		INSERT INTO BOO VALUES('XYD');
		INSERT INTO FOO VALUES(200);
		COMMIT;
	END TRY
	BEGIN CATCH
		ROLLBACK
	END CATCH

SELECT * FROM FOO;
SELECT * FROM BOO;

DROP TABLE FOO;
DROP TABLE BOO;