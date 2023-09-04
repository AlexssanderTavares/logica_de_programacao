=begin
    Fácil 6. Leia um vetor de 40 posições e atribua valor 0 para todos os 
    elementos que possuírem valores negativos. 
=end

vetor = Array.new

num = -40

loop do
    vetor << num += 1
    break if vetor.length == 80
end


vetor.each do |nums|
    if nums < 0
        nums = 0
    end
    puts nums
end
