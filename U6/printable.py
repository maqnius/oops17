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



  while A != [] or H != []:
    # verschiebt kleinste Scheibe um einen Platz
    x = stapel[0].pop()
    stapel[1].append(x)
    step += 1


    # gibt es andere verschiebbare Scheiben? wenn ja, verschiebe
    if stapel[0] != [] and (stapel[2] == [] or stapel[0][-1] < stapel[2][-1]):





      stapel[2].append(stapel[0].pop())
      step += 1
    



    elif stapel[2] != [] and (stapel[0] == [] or stapel[2][-1] < stapel[0][-1]):
    



      stapel[0].append(stapel[2].pop())
      step += 1
    




    stapel = [stapel[1],stapel[2],stapel[0]]

