print("Bienvenidos \nMis primeras Lineas de programacion \npython\n\n")

# # ejercicio 1 

numero = 4
numero2 = 5


print("la suma de estos dos numero es: ",numero + numero2)



# # ejercicio 2 

print("hola mundo")
print(3+4)


 # ejercicio 4

print("pepito")
print("cumpleaños: en el mes de enero")
edad = 30
print("tengo %s años" %edad)
cantante = "Ruben Blades"
comida = "ajiaco, frijoles"
ciudad = "saldaña"



a  = int(input("ingresa un numero"))
b  = int(input("ingresa un numero"))

print(a+b)



# ejercicio 5

d  = float(input("ingresa un numero: "))
c  = float(input("ingresa un numero: "))

print(d+c)


# # ejercicio 6

nombre = "anderson "

nombre += "david"

print("nombre: " , nombre)

# ejercicio 7 

mensaje = "hola"
espacio = " "
nombre = "david"

print(mensaje+espacio+nombre)


# ejercicio 8

numero_1 = 4
numero_2 = 8
resultado = numero_1 + numero_2
resultado = str(resultado)

print("la suma entre numero 1 y numero 2 es : " , resultado)

#ejercicio 9

mensaje_3 = "hola  soy un mensaje"

print(mensaje_3.find("soy"))

#ejercicio 10

extraer_SubCadena = mensaje_3[1:6]

print(extraer_SubCadena)



# ejercicio 11

comparar_1 = "Hola"
comparar_2 = "Hola"

print(comparar_1 = comparar_2)

# ejercicio 12 

numero_1 = 5
numero_2 = 3
resultado = numero_1 + numero_2

print("el resultado de la suma es : ", resultado)

# ejercicio 13 resta

numero_1 = 5
numero_2 = 3
resultado = numero_1 - numero_2

print("el resultado de la resta es : ", resultado)

# ejercicio 14 multiplicacion 

numero_1 = 5
numero_2 = 3
resultado = numero_1 * numero_2


print("el resultado de la multiplicacion es : ", resultado)

# ejercicio 15 exponente

numero_1 = 5
numero_2 = 3
resultado = numero_1 ** numero_2

print("el resultado del exponente es : ", resultado)

# ejercicio 16 division 

numero_1 = 5
numero_2 = 3
resultado = numero_1 / numero_2

print("el resultado de la division es : ", resultado)

# ejercicio 17 modulo 

numero_1 = 5
numero_2 = 3
resultado = numero_1 % numero_2

print("el resultado del modulo es : ", resultado)

# ejercicio 17 division entera 

numero_1 = 5
numero_2 = 3
resultado = numero_1 // numero_2

print("el resultado de la division entera es : ", resultado)



                # typos de datos

numero_entero = 5
print(numero_entero , type(numero_entero))



numero_flotante = 5.21
print(numero_flotante , type(numero_flotante))


numero_complejo = 5 + 2J

print(numero_complejo , type(numero_complejo))