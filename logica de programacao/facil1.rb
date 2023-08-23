=begin
    Fácil 1. Leia um vetor de 12 posições e em seguida ler também dois
    valores X e Y quaisquer correspondentes a duas posições no vetor. 
    Ao final seu programa deverá escrever a soma dos valores encontrados nas
    respectivas posições X e Y.
=end
vetor = [1,2,3,4,5,6,7,8,9,10,11,12]
x = vetor[rand(0..11)]
y = vetor[rand(0..11)]
puts "X= #{x}"
puts "Y= #{y}"
puts "SOMA: #{x+y}"