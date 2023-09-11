# Fácil 3. Leia um vetor de 16 posições e troque os 8 primeiros valores pelos
# 8 últimos e vice-e-versa. Escreva ao final o vetor obtido. 

vetor = [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]

vet = vetor.rotate(8)
puts vet

vetor = vet.rotate(8)
puts vetor


