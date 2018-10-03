package ejercicios;

public class ejercicios_postgresql {

/*

CONSULTAS

EJERCICIO 1


select p.tipodoc, p.documento, p.nombre, p.apellido, a.legajo from persona p 
inner join alumno a on a.idpersona=p.identificador


EJERCICIO 2


select persona.nombre, persona.apellido, alumno.legajo, carrera.nombre, inscripciones_carrera.fechainscripcion
from persona
inner join alumno on alumno.idpersona=persona.identificador
inner join inscripciones_carrera on inscripciones_carrera.idalumno=alumno.identificador
inner join carrera on carrera.identificador=inscripciones_carrera.idcarrera 
ORDER BY alumno.legajo DESC


EJERCICIO 3

select curso.nombre, carrera.nombre,count(*) as cantdeinscriptos, curso.cupomaximo from curso
inner join carrera on carrera.identificador=curso.idcarrera
inner join inscripciones_curso on inscripciones_curso.idcurso=curso.identificador
GROUP BY curso.nombre,carrera.nombre,curso.cupomaximo


EJERCICIO 4

select curso.nombre, carrera.nombre,count(*) as cantdeinscriptos, curso.cupomaximo from curso
inner join carrera on carrera.identificador=curso.idcarrera
inner join inscripciones_curso on inscripciones_curso.idcurso=curso.identificador
GROUP BY curso.nombre,carrera.nombre,curso.cupomaximo
HAVING count(*)>curso.cupomaximo


EJERCICIO 5

UPDATE curso SET cupomaximo=10
WHERE anio=2018 and cupomaximo<5


EJERCICIO 6

----consulta--------

select persona.nombre,persona.apellido, inscripciones_carrera.fechainscripcion, inscripciones_curso.fechainscripcion
FROM inscripciones_carrera
inner join alumno on alumno.identificador=inscripciones_carrera.idalumno
inner join persona on persona.identificador=alumno.idpersona
inner join inscripciones_curso on inscripciones_curso.idalumno=inscripciones_carrera.idalumno
WHERE inscripciones_carrera.fechainscripcion>inscripciones_curso.fechainscripcion


---update-----

UPDATE inscripciones_curso SET fechainscripcion='2018-09-30'
FROM inscripciones_carrera t
WHERE t.fechainscripcion>inscripciones_curso.fechainscripcion 
AND t.idalumno=inscripciones_curso.idalumno


EJERCICIO 7


INSERT INTO persona (identificador, tipodoc, documento, nombre, apellido, fechanac)
VALUES (6,'DNI', 38818820, 'Emanuel', 'Samana', '1995-03-01');


INSERT INTO alumno (identificador, idpersona, legajo)
VALUES (6, 6, 20455)


EJERCICIO 8

ALTER TABLE persona ADD direccion varchar(200)


Considero que es mas conveniente en la tabla persona, ya que corresponde a los datos personales del alumno.




*/
}
