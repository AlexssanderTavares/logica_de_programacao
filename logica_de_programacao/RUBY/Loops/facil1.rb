print "Digite um número: "
num1 = gets.chomp.to_i
tab = 0
while tab <= 100
    puts "#{num1} x #{tab} = #{num1 * tab}"
    tab+=1
end

puts "---------------------------------------"

