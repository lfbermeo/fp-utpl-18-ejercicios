"""Imprimir reporte de estudiante """



contador = 1
limite=3
cadena = "{0}\{1}\t{2}\t{3}\t{4}\t{5}\n".format ("Nombre", "Nota 1", "Nota 2", "Nota 3",  "Promedo")
while contador <= limite
	nombre = input ("Ingrese nombre del estudiante: \n")
	nota_1 = input ("Ingrese nota 1: \n")
	nota_2 = input ("Ingrese nota 2: \n")
	nota_3 = input ("Ingrese nota 3: \n" )

	contador = contador +1
	suma = nota_1 + nota_2 + nota_3
	prome = suma/limite
	cadena = "{0}\{1}\t{2}\t{3}\t{4}\{5}\n". format (cadena, nombre), int (nota_1, nota_2, nota_3), float (prome)

print (cadena)	
