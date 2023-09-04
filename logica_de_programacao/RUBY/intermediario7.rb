=begin
    Intermediário 7. Leia dois vetores de 20 posições e calcule um terceiro vetor 
    contendo, nas posições pares os valores do primeiro e nas posições impares os 
    valores do segundo. 
=end

vetor1 = Array.new
vetor2 = Array.new
newvet = Array.new
index = 0



loop do
    vetor1 << index
    vetor2 << index

    if index % 2 == 0
    valor1 = "Posição: #{index} | Valor vetor1: #{vetor1[index]}"
    newvet << valor1
    elsif index % 2 == 1
    valor2 = "Posição: #{index} | Valor vetor2: #{vetor2[index]}"
    newvet << valor2
    
    end
    puts newvet
    puts "CLASSE VALOR1: #{valor1.class}"
    puts "CLASSE VALOR2: #{valor2.class}"
        
    index += 1
    break if vetor1.length == 20 && vetor2.length == 20
end



