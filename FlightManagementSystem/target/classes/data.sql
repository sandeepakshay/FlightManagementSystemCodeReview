
INSERT INTO Flight(flight_number,carrier_name,flight_model,seat_capacity) VALUES('6E 1232','Indigo','International',4500);
INSERT INTO Flight(flight_number,carrier_name,flight_model,seat_capacity) VALUES('6E 1210','AirAsia','domestic',300);
INSERT INTO Flight(flight_number,carrier_name,flight_model,seat_capacity) VALUES('6E 6699','AirIndia','domestic',250);
INSERT INTO Flight(flight_number,carrier_name,flight_model,seat_capacity) VALUES('6E 1200','Indigo','domestic',200);


INSERT INTO Airport(airport_code,airport_location,airport_name) VALUES('VTZ','vizag','vishakapatnam airport');
INSERT INTO Airport(airport_code,airport_location,airport_name) VALUES('DEL','Delhi','Indhiragandhi airport');
INSERT INTO Airport(airport_code,airport_location,airport_name) VALUES('HYB','Hyderabad','Rajiv gandhi airport');
INSERT INTO Airport(airport_code,airport_location,airport_name) VALUES('BLR','Bangalore','Kempegowda International Airport');
INSERT INTO Airport(airport_code,airport_location,airport_name) VALUES('CCU','kolkata','Netaji Subhas Chandra Bose International Airport');


INSERT INTO Passenger(pnr_number,luggage,passenger_age,passenger_name) VALUES(11345,2.5,21,'sandeep');
INSERT INTO Passenger(pnr_number,luggage,passenger_age,passenger_name) VALUES(12245,10,31,'karteek');
INSERT INTO Passenger(pnr_number,luggage,passenger_age,passenger_name) VALUES(11335,9,29,'akshay');
INSERT INTO Passenger(pnr_number,luggage,passenger_age,passenger_name) VALUES(22345,12,25,'sunil');


INSERT INTO Users(user_id,user_name,user_phone,user_type,email,password) VALUES(1,'Narasimha',7981678687,'admin','kasula78@gmail.com','nara');
INSERT INTO Users(user_id,user_name,user_phone,user_type,email,password) VALUES(2,'sandeep',9815762620,'user','sandeepakshay0101@gmail.com','akshay@0101');


INSERT INTO Booking(booking_id,bookingdate,no_of_passengers,ticket_cost,flight_num,user_id) VALUES(1,date '2020-04-22',12,5000,'6E 1232',1);
INSERT INTO Booking(booking_id,bookingdate,no_of_passengers,ticket_cost,flight_num,user_id) VALUES(2,date '2020-04-23',5,6500,'6E 1210',2);

INSERT INTO schedule(schedule_id,arrival_time,departure_time,dest_airport_code,source_airport_code,flight,available_seats,ticket_cost) VALUES(4,'2020-05-20 14:30:00','2020-05-21 11:30:00','DEL','HYB','6E 1232',150,2500);

