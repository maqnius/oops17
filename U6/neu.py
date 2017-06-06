# ////////////// die Hanoi Loesung //////////////
def hanoi(n):


  assert (n > 0)                                      
# P
  A = list(range(n,0,-1))
  H = []
  Z = []
#inv

  if (n % 2 == 0):
	# P+ B_ifglob

	stapel = [A,H,Z]
	# INV
	while A != [] or H != []:
		# INV + B

		# verschiebt kleinste Scheibe um einen Platz
		x = stapel[0].pop()


		stapel[1].append(x)


		# INV

		# gibt es andere verschiebbare Scheiben? wenn ja, verschiebe
		if stapel[0] != [] and (stapel[2] == [] or stapel[0][-1] < stapel[2][-1]):
		# INV + B + B_if


		  stapel[2].append(stapel[0].pop())

		  stapel = [stapel[1],stapel[2],stapel[0]]	


		# INV
		elif stapel[2] != [] and (stapel[0] == [] or stapel[2][-1] < stapel[0][-1]):
		# INV + B + B_elif


		  stapel[0].append(stapel[2].pop())

		  stapel = [stapel[1],stapel[2],stapel[0]]	
		# INV
		else:
		# INV + B + ~B_if + ~B_elif
			stapel = [stapel[1],stapel[2],stapel[0]]


		# INV


	# INV + ~ B
	# Q

#============== zweiter abschnitt ====================
  else:

	stapel = [A,Z,H]

	# INV
	while A != [] or H != []:
		# INV + B

		# verschiebt kleinste Scheibe um einen Platz
		x = stapel[0].pop()


		stapel[1].append(x)


		# INV

		# gibt es andere verschiebbare Scheiben? wenn ja, verschiebe
		if stapel[0] != [] and (stapel[2] == [] or stapel[0][-1] < stapel[2][-1]):
		# INV + B + B_if


		  stapel[2].append(stapel[0].pop())

		  stapel = [stapel[1],stapel[2],stapel[0]]	


		# INV
		elif stapel[2] != [] and (stapel[0] == [] or stapel[2][-1] < stapel[0][-1]):
		# INV + B + B_elif


		  stapel[0].append(stapel[2].pop())

		  stapel = [stapel[1],stapel[2],stapel[0]]	
		# INV
		else:
		# INV + B + ~B_if + ~B_elif
			stapel = [stapel[1],stapel[2],stapel[0]]


		# INV


	# INV + ~ B
	# Q
