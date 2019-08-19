import hsa.Console;
class Desempenio20_Clase3
{
static Console c;
public static void main (String arg[])
{
int x, y;
c = new Console ();
c.print("ingrese el valor entero de x: ");
x = c.readInt();
c.print("ingrese el valor entero de y: ");
y = c.readInt();
if (x>0 && y>0)
{
c.print("Cuadrante 1");
}
else
if (x<0 && y>0)
{
c.print("Cuadrante 2");
}
else
if (x<0 && y<0)
{
c.print("Cuadrante 3");
}
else
{
c.print("Cuadrante 4");
}
}
}
