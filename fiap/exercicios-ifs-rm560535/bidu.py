colaboradores = int(input("Informe o número de colaboradores: "))
votos = [0, 0, 0, 0, 0]
dias = ["segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira"]
maior = ""
escolhido = ""
i = 1



while (i <= colaboradores):
    resposta = input("Informe o dia de sua preferência (segunda-feira, terça-feira, quarta-feira, quinta-feira, sexta-feira): ")
    if (resposta == "segunda-feira"):
        votos[0] = votos[0] + 1
    elif (resposta == "terça-feira"):
        votos[1] = votos[1] + 1
    elif (resposta == "quarta-feira"):
        votos[2] = votos[2] + 1
    elif (resposta == "quinta-feira"):
        votos[3] = votos[3] + 1
    elif (resposta == "sexta-feira"):
        votos[4] = votos[4] + 1
    else:
        print("Inválido!")
    i = i + 1

for i in range(0, len(votos)-1):
    for j in range(1, len(votos)-1):
        if votos[i] > votos[j]:
            maior = votos[i]
            escolhido = dias[i]
        elif votos[j] > votos[i]:
            maior = votos[j]
            escolhido = dias[j]

print(f"O dia escolhido pelos colaboradores é: {escolhido}, com {maior} votos.")












