public class apuntes_Java {
    public static void main(String[] args) {
        //Aquí voy a poner funciones, que he investigado por ahí, mientras miraba cosas
        System.out.println("Hola");
        //Apuntes
        /*
        Operadores Java
        = --> Asignación simple
        += --> Suma y asigna
        -= --> Resta y asigna
        *= --> Multiplica y asigna
        /= --> Divide y asigna
        */
    }
    //función - capicua (si el número es el mismo invertido, ej: 121 si es; 234 no lo es
    public static boolean esCapicua(int numero){
        int original = numero; //guardamos el número original
        int invertido = 0; //Aquí almacenamos el número invertido

        //Invertir número
        while (numero > 0){
            int digito = numero % 10;  //Tomamos el último dígito del número //ej: 2345 , el último dígito es 5
            invertido = invertido * 10 + digito;  //añadimos el dígito al número invertido
            numero /= 10; //Eliminamos el último dígito de "numero"
        } //vale y porque 10 ? - Bueno es simple, porque en decimal usamos base de 10
            //mientras que en binario usamos bases de 2 y en octal 8 y en hexadecimal 16
            return original == invertido;
        }
        public static int sumaDigitos(int numero){
        int suma = 0;
        while (numero != 0){
            suma += numero % 10; //añade el último dígito a la suma
            numero /=10; //Elimina el último dígito
        }
        return suma;
        }
    }
