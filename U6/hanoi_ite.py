import math

# ////////////// Print-Funktion //////////////
def printStapel(A,H,Z):
  """ zeigt den Status der Tuerme an, hat nur Lesezugriffe auf die Stapel """
  # Anzahl der Scheiben pro Stab
  nA = len(A)
  nH = len(H)
  nZ = len(Z)
  N = nA + nH + nZ      # Gesamtzahl der Scheiben
  # fuellt Staebe auf gleiche Hoehe auf
  Anew = [chr(9474) for i in range(N-nA)] + [ str(x) for x in (A[::-1])]
  Hnew = [chr(9474) for i in range(N-nH)] + [ str(x) for x in (H[::-1])]
  Znew = [chr(9474) for i in range(N-nZ)] + [ str(x) for x in (Z[::-1])]
  # ermittelt groesste Ziffernzahl
  breite = int(math.log10(N))+1
  string = 3*(' ' * breite + chr(9474)) + '\n'
  for i in range(N):
    for x in [Anew,Hnew,Znew]:
      string += ' '*(breite - len(x[i]) +1) + x[i]
    string += '\n'
  string += 3*(chr(9473) * breite + chr(9527)) + '\n'
  string += (' ' * breite + 'A') + (' ' * breite + 'H') + (' ' * breite + 'Z') + '\n'
  print(string)
  

# ////////////// die Hanoi Loesung //////////////
def hanoi(n):
  global step

  assert (n > 0)                                      
  A = list(range(n,0,-1))
  H = []
  Z = []
  if (n % 2 == 0):
    stapel = [A,H,Z]
  else:
    stapel = [A,Z,H]
  printStapel(A,H,Z)                                  # nur Lesezugriffe
  
  while A != [] or H != []:
    # verschiebt kleinste Scheibe um einen Platz
    x = stapel[0].pop()
    stapel[1].append(x)
    step += 1
    printStapel(A,H,Z)                                # nur Lesezugriffe
    # gibt es andere verschiebbare Scheiben? wenn ja, verschiebe
    if stapel[0] != [] and (stapel[2] == [] or stapel[0][-1] < stapel[2][-1]):
      stapel[2].append(stapel[0].pop())
      step += 1
    elif stapel[2] != [] and (stapel[0] == [] or stapel[2][-1] < stapel[0][-1]):
      stapel[0].append(stapel[2].pop())
      step += 1
    printStapel(A,H,Z)                                # nur Lesezugriffe
    stapel = [stapel[1],stapel[2],stapel[0]]



# ////////////// externer Aufruf //////////////
step = 0                                              # Anzahl der Zuege

try:
  n = int(input('\nGeben Sie eine Scheibenzahl n>0 ein: '))
  hanoi(n)
except ValueError:
  print('Es muss eine natuerliche Zahlsein')

print ("Anzahl der Zuege:", step)
