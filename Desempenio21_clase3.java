import hsa.Console;
class Desempenio21_clase3
{
static Console c;
public static void main (String arg[])
{
int pr, pc, porcentaje;
String n;
c = new Console();
c.print("Ingrese su nombre: ");
n = c.readLine();
c.print("Ingrese la cantidad de preguntas respondidas: ");
pr = c.readInt();
c.print("Ingrese la cantidad de preguntas correctas: ");
pc = c.readInt();
porcentaje = pc * 100 / pr;
if (porcentaje >= 90)
{
c.print ("Nivel superior");
}
else
if (porcentaje >= 75 && porcentaje < 90)
{
c.print ("Nivel medio");
}
else
if (porcentaje >= 50 && porcentaje < 75)
{
c.print ("Nivel regular");
}
else
{
c.print("Fuera de nivel");
}
}
}
