
compra = int(input("digite el monto a gastar: "))


if compra<= 100 :
    print("pago en efectivo")
elif compra > 100 and compra< 300 :
    print("pago con targeta debito")
else:
    print("pago con targeta de credito") 
