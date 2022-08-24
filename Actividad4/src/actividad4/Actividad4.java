import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
    int cantEstudiantes, i=0;
    double acumulado, nota, promMat, promEsp, promIng;
    String materia;
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese la materia: ");
    materia = sc.nextLine();
    System.out.print("Ingrese la cantidad de estudiantes: ");
    cantEstudiantes = sc.nextInt();

	
    switch(materia){
	case "matematicas":
		acumulado=0.0;
		for(i=1;i<=cantEstudiantes;i++){
		System.out.print("Ingrese la nota del estudiante " + i + ": ");
		nota = sc.nextDouble();
		acumulado += nota;
		}
		promMat=acumulado/cantEstudiantes;
		System.out.println("Promedio matematicas: " + promMat);
		break;
	case "español":
		i = 1;
		acumulado = 0.0;
		while(i<=cantEstudiantes){
		System.out.print("Ingrese la nota del estudiante " + i + ": ");
		nota = sc.nextDouble();
		acumulado += nota;
		i++;	
		}
		promEsp=acumulado/cantEstudiantes;
		System.out.println("Promedio espanol: " + promEsp);
		break;
	case "ingles":
		i = 1;
		acumulado = 0.0;
		do{
		System.out.print("Ingrese la nota del estudiante " + i + ": ");
		nota = sc.nextDouble();
		acumulado += nota;
		i++;	
		} while (i <= cantEstudiantes);
		promIng=acumulado/cantEstudiantes;
		System.out.println("Promedio ingles: " + promIng);
		}
	}
}