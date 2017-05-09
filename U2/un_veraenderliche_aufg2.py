a=[1 ,3 ,(4 ,2) ] # lege liste a an
b=(a,a ,[1 ,5 ,4 ,3]) # lege tuple b an, b[0]=b[1]=id(a)
print(b [1][2]) # ausgabe: (4,2)
b [1][2]="wer"  # an der zweiten stelle von ist adresse von a,
                #  in der liste a wird an dritte stelle (4,2) durch "wer" ersetzt
print(b)        # ausgabe : ([1, 3, 'wer'], [1, 3, 'wer'], [1, 5, 4, 3])
a [2][1]        # ausgabe : 'e'
#a [2][1]="wann" # ERROR! einzelnes element kann nicht geändert werden, da tuple! andere variante:
a[2] = "wann"   # ersetzt "wer" mit "wann"
print(b)        # ausgabe : ([1, 3, 'wann'], [1, 3, 'wann'], [1, 5, 4, 3])
b [2][1]        # ausgabe : 5
b [2][1]=["wo","wie"]   # 5 wird mit der liste ["wo", "wie"] ersetzt
print(b)        # ausgabe : ([1, 3, 'wann'], [1, 3, 'wann'], [1, ['wo', 'wie'], 4, 3])
#b[2]=[2,4]      # ERROR! b ist ein tuple, und element kann nicht geändert werden! Alternative
b[2][:] = [2,4]

print(b)        # ausgabe : ([1, 3, 'wann'], [1, 3, 'wann'], [2, 4])
a="warum"       # "neue" variable a wird mit string belegt
print(b)        # ausgabe : ([1, 3, 'wann'], [1, 3, 'wann'], [2, 4])