import hsa.Console;
class Desempenio19_Clase3
{
static Console c;
public static void main (String arg[])
{
int n1, n2, n3, suma, producto;
c = new Console();
c.print ("Ingrese el primer numero: ");
n1 = c.readInt();
c.print ("Ingrese el segundo numero: ");
n2 = c.readInt();
c.print ("Ingrese el tercer numero: ");
n3 = c.readInt();
suma = n1 + n2;
producto = suma * n3;
if (n1 == n2 && n1 == n3 && n2 == n3)
{
c.print("La suma del n1 y n2: " + suma);
c.println();
c.print("El producto del n3 y de la suma entre el n1 y n2 es: " + producto);
}
else
{
c.print("Los numeros no son iguales");
}
}
}
