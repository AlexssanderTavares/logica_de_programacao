=begin
    Fácil 4. Leia um vetor de 20 posições e em seguida um valor X qualquer. 
    Seu programa devera fazer uma busca do valor de X no vetor
    lido e informar a posição em que foi encontrado ou se não foi encontrado. 
=end

vetor = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]

print "Digite um numero: "
x = gets.chomp.to_i

if vetor.include?(x)
    ind = vetor.index(x)
    puts "Posição: #{ind} Numero: #{x}"
else
    raise "numero não existe no array"
end