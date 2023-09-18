#GRUPO: Artur Purper, Leonardo Fagudes e Rafael Leivas

user1 = 0
user2 = 0

while True:

  print("------------------------------------USUÁRIO 1-----------------------------")  

  print("\nMenu:")
  print("1. Mostrar quantidade de solicitações na fila principal")
  print("2. Validar solicitação")
  print("3. Adicionar solicitação à fila")
  print("4. Mostrar solicitações recusadas")
  print("5. Emitir relatório")
  print("6. Sair")
  opcao = input("Escolha uma opção: ")

  if opcao == '1':
    print(f"Quantidade de solicitações na fila principal: {len(codigos)}")
  elif opcao == '2':
    print(f"Solicitações aguardando: {len(codigos)}")
    
    pendencias = []
    for codigo in codigos:    
      print(f"Código: {codigo}")
      
      validacao = input("Deseja validar este código? (S para sim, N para não): ")
      
      if validacao.upper() == "S":
          print(f"Código {codigo} validado!")
          if codigo == "001":
            user1 += 2;
          elif codigo == "010":
            user1 += 3;
          elif codigo == "322":
            user1 += 5;
          elif codigo == "324":
            user1 += 20;
          elif codigo == "345":
            user1 += 50;
          elif codigo == "456":
            user1 += 20;
      elif validacao.upper() == "N":
          pendencias.append(codigo)
          print(f"Código {codigo} não validado.")
      else:
          print("Opção inválida. Utilize S ou N para validar ou não validar.")

      print("Todos os códigos foram verificados.")
      print(f"O número de horas foi: {user1}")
      print(f"Os arquivos não aceitos foram: {pendencias}")

  elif opcao == '3':
    codigos = []
    matricula = input("Digite a sua matricula: ")

    codigosCertos = {"001", "010", "322", "324", "345", "456"}

    while True:
        codigo = input("Digite o código (ou 0 para sair): ")
        
        if codigo == "0":
            print("Saindo do programa.")
            break

        elif codigo not in codigosCertos:
          while True:
            codiguin = input("Digite um código valido (ou 0 para sair): ")
            if codiguin == "0":
              print("Saindo")
              break
            elif codiguin in codigosCertos:
              codigos.append(codiguin)
              break
        elif codigo in codigosCertos:
            codigos.append(codigo)

    print("Códigos válidos inseridos:", codigos)

  elif opcao == '4':
    print(f"Os códigos recusados foram: {pendencias}")
  elif opcao == '5':
    print(f"O número da matricula: {matricula}, teve {user1} horas")
  elif opcao == '6':
    break

while True:

  print("------------------------------------USUÁRIO 2-----------------------------")  

  print("\nMenu:")
  print("1. Mostrar quantidade de solicitações na fila principal")
  print("2. Validar solicitação")
  print("3. Adicionar solicitação à fila")
  print("4. Mostrar solicitações recusadas")
  print("5. Emitir relatório")
  print("6. Sair")
  opcao = input("Escolha uma opção: ")

  if opcao == '1':
    print(f"Quantidade de solicitações na fila principal: {len(codigos)}")
  elif opcao == '2':
    print(f"Solicitações aguardando: {len(codigos)}")
    
    pendencias = []
    for codigo in codigos:    
      print(f"Código: {codigo}")
      
      validacao = input("Deseja validar este código? (S para sim, N para não): ")
      
      if validacao.upper() == "S":
          print(f"Código {codigo} validado!")
          if codigo == "001":
            user2 += 2;
          elif codigo == "010":
            user2 += 3;
          elif codigo == "322":
            user2 += 5;
          elif codigo == "324":
            user2 += 20;
          elif codigo == "345":
            user2 += 50;
          elif codigo == "456":
            user2 += 20;
      elif validacao.upper() == "N":
          pendencias.append(codigo)
          print(f"Código {codigo} não validado.")
      else:
          print("Opção inválida. Utilize S ou N para validar ou não validar.")

      print("Todos os códigos foram verificados.")
      print(f"O número de horas foi: {user2}")
      print(f"Os arquivos não aceitos foram: {pendencias}")

  elif opcao == '3':
    codigos = []
    matricula = input("Digite a sua matricula: ")

    codigosCertos = {"001", "010", "322", "324", "345", "456"}

    while True:
        codigo = input("Digite o código (ou 0 para sair): ")
        
        if codigo == "0":
            print("Saindo do programa.")
            break

        elif codigo not in codigosCertos:
          while True:
            codiguin = input("Digite um código valido (ou 0 para sair): ")
            if codiguin == "0":
              print("Saindo")
              break
            elif codiguin in codigosCertos:
              codigos.append(codiguin)
              break
        elif codigo in codigosCertos:
            codigos.append(codigo)

    print("Códigos válidos inseridos:", codigos)

  elif opcao == '4':
    print(f"Os códigos recusados foram: {pendencias}")
  elif opcao == '5':
    print(f"O número da matricula: {matricula}, teve {user2} horas")
  elif opcao == '6':
    break


while True:
  ainda = int(input("[sair 0] Digite 1 para ver o resultado o usuário 1 ou 2 para ver o resultado do usuário 2: "))

  if ainda == 1:
    print(f"O número de horas do usuário 1 foi de {user1}")
  elif ainda == 2:
    print(f"O número de horas do usuário 2 foi de {user2}")
  elif ainda == 0:
    break
