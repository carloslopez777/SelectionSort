public class SelectionSort {
    //Crea método selectionsort que recibe arreglo de numeros enteros
    public static void selectionSort(int[] arr) {
        //crea variable n y guarda cantidad de elementos de arreglo
        int n = arr.length;

//Crea bucle con variable i iniciando con 0, comprueba si i es menor que 
//variable n-1 para continuar con bucle, por cada vuelta se le suma uno a i
        for (int i = 0; i < n - 1; i++) {
            //Crea variable minIdx que guarda índice de número más pequeño encontrado hasta el momento.
            int minIdx = i;
            //Busca en la siguiente posición y avanza mientras j<n, y avanza a la siguiente posición.
            for (int j = i + 1; j < n; j++) {
                //Se revisa num de posicion y comparar con numero pequeño
                if (arr[j] < arr[minIdx]) {
                    //Si lo encuentra actualiza índica del menor
                    minIdx = j;
                }
            }
//guarda el número más pequeño en una variable temporal llamada temp
            int temp = arr[minIdx];
            //coloca el número de la posición i en la posición donde estaba el menor.
            arr[minIdx] = arr[i];
            //coloca el menor en la posición i
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numeros = {64, 25, 12, 22, 11};

        selectionSort(numeros);

        System.out.println("Arreglo ordenado:");
        //declara una variable que recibe cada número del arreglo numeros
        for (int num : numeros) {
            //Imprime cada número seguido de un espacio
            System.out.print(num + " ");
        }
    }
}