-- mostrar numeros del 1 al 100 ciclo while
set serveroutput on;

declare
    indice number := 1;
begin 

    while (indice <= 100) 
    loop
    DBMS_OUTPUT.PUT_LINE(indice);
    indice := indice + 1;
    end loop;

end ;
/

-- mostrar numeros del 1 al 10 ciclo for


begin 

for i in 1..10

loop 
    DBMS_OUTPUT.PUT_LINE(i);
end loop;

END;
/

-- mostrar numeros del 1 al 100 con loop


declare

indice number := 1;


begin 

loop 
DBMS_OUTPUT.PUT_LINE(indice);
exit when indice = 10;
indice := indice + 1;


end loop;

end;
/

-- CONSULTAS SELECT INTO 

declare 

v_id_employee employees.employee_id%type := &id_employee;
v_first_name employees.first_name%type;

begin 

select  first_name into v_first_name from employees where employee_id = v_id_employee; 

DBMS_OUTPUT.PUT_LINE('el nombre del cliente es: ' ||v_first_name);


exception 

when NO_DATA_FOUND then 

DBMS_OUTPUT.PUT_LINE('NO SE ENCONTRO NINGUN REGISTRO');

end;
/

declare 
v_id_employee employees.employee_id%type := &id_employee;
v_name_employee employees.first_name%type;
v_email employees.email%type;
v_phone employees.phone_number%type;

begin 

select first_name,email,phone_number into v_name_employee,v_email,v_phone from employees where employee_id = v_id_employee;

DBMS_OUTPUT.PUT_LINE('EL NOMBRE ES : ' || v_name_employee );
DBMS_OUTPUT.PUT_LINE('el correo es: ' || v_email);
DBMS_OUTPUT.PUT_LINE('el numero de telefono es: ' || v_phone);

end;


/
declare 
v_id_employee employees.employee_id%type := &id_employee;
v_employees employees%rowtype;

begin 

select * into v_employees from employees where employee_id = v_id_employee;

DBMS_OUTPUT.PUT_LINE('EL NOMBRE ES : ' || v_employees.first_name );
DBMS_OUTPUT.PUT_LINE('el correo es: ' || v_employees.email);
DBMS_OUTPUT.PUT_LINE('el numero de telefono es: ' || v_employees.phone_number);

end;
/

create or replace function pagos_clientes(codigo_employee  employees.employee_id%type)

return number
as
v_sumapagos number;
begin 
select sum(salary) into v_sumapagos
from employees 
where employee_id = codigo_employee;

return v_sumapagos;


end;

/

declare 

v_codigo_pedido employees.employee_id%type := &id;
v_pagos number;
begin

   v_pagos := PAGOS_CLIENTES(v_codigo_pedido);
    DBMS_OUTPUT.put_line(v_pagos);
end;
/

create or replace procedure sueldo(v_job_id jobs.job_id%type)

as

v_sueldo_total number;

begin

select (min_salary * max_salary) into v_sueldo_total from jobs where job_id = v_job_id;
DBMS_OUTPUT.PUT_LINE('TOTAL' || v_sueldo_total);

end;
/

declare 

v_job_id jobs.job_id%type;

begin 

    v_job_id := 'AD_PRES';
    sueldo(v_job_id);
    
end;
/

