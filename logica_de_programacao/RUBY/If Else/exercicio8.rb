print "What's the price for Skol? "
skol_price = gets.chomp.to_f

print "What's the price for kaiser? "
kaiser_price = gets.chomp.to_f

print "What's the price for Heineken? "
heineken_price = gets.chomp.to_f


puts"Skol: #{skol_price}
     Kaiser: #{kaiser_price}
     Heineken: #{heineken_price}"

if skol_price < kaiser_price && skol_price < heineken_price
    puts "You should buy Skol for: #{skol_price}"
elsif kaiser_price < skol_price && kaiser_price < heineken_price
    puts "You should buy Kaiser for: #{kaiser_price}"
else
    puts "You should buy Heineken for: #{heineken_price}"
end