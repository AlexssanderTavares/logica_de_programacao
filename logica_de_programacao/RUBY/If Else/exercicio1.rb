print "Digite um número: "
num1 = gets.chomp.to_i

print "Digite outro número: "
num2  = gets.chomp.to_i

if num1 > num2
    puts "#{num1} é maior"
elsif num2 > num1
    puts "#{num2} é maior"
end