print "What's your gender? M/F "
gender = gets.chomp.to_s

if gender == "M" || gender == "m" || gender == "male" || gender == "Male" || gender == "MALE"
    puts "M - Male"
elsif gender == "F" || gender == "f" || gender == "Female" || gender == "female" || gender == "FEMALE"
    puts "F - Female"
end
