# ////////////// die Hanoi Loesung //////////////
def hanoi(n):


  assert (n > 0)                                      
  A = list(range(n,0,-1))
  H = []
  Z = []

  if (n % 2 == 0):

	S = [A,H,Z]
	while A != [] or H != []:

		# verschiebt kleinste Scheibe um einen Platz
		S[1].append(S[0].pop())
		
		# gibt es andere verschiebbare Scheiben? wenn ja, verschiebe
		if S[0] != [] and (S[2] == [] or S[0][-1] < S[2][-1]):
		  S[2].append(S[0].pop())

		  S = [S[1],S[2],S[0]]	

		elif S[2] != [] and (S[0] == [] or S[2][-1] < S[0][-1]):
		  S[0].append(S[2].pop())

		  S = [S[1],S[2],S[0]]	

		else:
			S = [S[1],S[2],S[0]]

  else:

	S = [A,Z,H]

	while A != [] or H != []:
		# verschiebt kleinste Scheibe um einen Platz
		S[1].append(S[0].pop())

		# gibt es andere verschiebbare Scheiben? wenn ja, verschiebe
		if S[0] != [] and (S[2] == [] or S[0][-1] < S[2][-1]):
		  S[2].append(S[0].pop())

		  S = [S[1],S[2],S[0]]	

		elif S[2] != [] and (S[0] == [] or S[2][-1] < S[0][-1]):

		  S[0].append(S[2].pop())

		  S = [S[1],S[2],S[0]]	

		else:
			S = [S[1],S[2],S[0]]
