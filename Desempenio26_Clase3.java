import hsa.Console;
class Desempenio26_Clase3
{
static Console c;
public static void main (String arg[])
{
int dia;
c = new Console();
c.print("Ingrese un valor entero de 0 a 6 y le indicara a que dia corresponde: ");
dia = c.readInt(); 
switch(dia)
{
case 0: c.print("Domingo");
break;
case 1: c.print("Lunes");
break;
case 2: c.print("Martes");
break; 
case 3: c.print("Miercoles");
break;
case 4: c.print("Jueves");
break;
case 5: c.print("Viernes");
break; 
case 6: c.print("Sabado");
break; 
default: c.println("Ingrese un valor valido");
break;
}
}
}
