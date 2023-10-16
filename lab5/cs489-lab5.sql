select * FROM `cs489-apsd-lab5a-dental-surgery-db`.`dentist` order by lastName asc;

select a.appointmentId, a.appointmentDate, a.appointmentTime, p.firstName PatientFirstName, p.lastName PatentLastName
from `cs489-apsd-lab5a-dental-surgery-db`.`appointments` as a
inner join `cs489-apsd-lab5a-dental-surgery-db`.`patients` as p
on a.patientId = p.patientId
where a.dentistId = 1;

select * from `cs489-apsd-lab5a-dental-surgery-db`.`appointments` a
where a.surgeryId = 1;

select * from `cs489-apsd-lab5a-dental-surgery-db`.`appointments` a
where a.patientId = 1 and a.appointmentDate = '2013-09-12';