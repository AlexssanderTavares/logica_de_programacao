=begin
    Fácil 5. Leia um vetor de 40 posições.
    Contar e escrever quantos valores pares ele possui.        
=end


vetor = Array.new
num = 0
arr = Array.new
loop do
    vetor << num
    num += 1 
    break if vetor.length == 40
end

vetor.map! do |nums|
    if nums % 2 == 0
    arr << nums
    end
end

puts "Quantidade de números pares:  #{arr.length}"