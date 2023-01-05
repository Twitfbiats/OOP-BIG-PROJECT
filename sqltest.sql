CREATE TABLE address(
	id int(11) PRIMARY KEY NOT NULL,
    location varchar(255) NOT NULL
);

CREATE TABLE Customer(
	id int(11) PRIMARY KEY NOT NULL,
    name varchar(255) NOT NULL,
    phone_number int(11) NOT NULL,
    address int(11) NOT NULL,
    role ENUM ('Sender','Receiver','Nobody') DEFAULT 'Nobody',
    FOREIGN KEY (address) REFERENCES address(id)
);

CREATE TABLE package (
	id int(11) PRIMARY KEY NOT NULL,
    description varchar(255),
  	weight float(4)  NOT NULL,
    sender int(11) NOT NULL,
    receiver int(11) NOT NULL,
    from_where int(11) NOT NULL,
    to_where int(11) NOT NULL,
    distance float(4) NOT NULL,
    fee float(6) NOT NULL,
    transport_type varchar(255) NOT NULL,
    send_date Date NOT NULL,
    receive_date_estimation date NOT NULL,
    status varchar(255) NOT NULL,
    FOREIGN KEY (sender) REFERENCES customer(id),
    FOREIGN KEY (receiver) REFERENCES customer(id),
    FOREIGN KEY (from_where) REFERENCES address(id),
    FOREIGN KEY (to_where) REFERENCES address(id)
);

INSERT INTO address(id,location)
VALUES
(1,"Ha Noi"),(2,"HCM"),(3,"An Giang"),(4,"Ca Mau");

INSERT INTO customer(id,name,phone_number,address,role)
VALUES (1,"Nguyen Van Sender","0968600131",1,1),(2,"Nguyen Van Receiver","0974235612",2,2),
(3,"Nguyen Tran Phuc","0926789921",3,1),(4,"Vu Duc Dam","0238640023",4,2);

INSERT INTO package(id,description,weight,sender,receiver,from_where,to_where,distance,fee,transport_type,send_date,receive_date_estimation,status)
VALUES
(1,"Áo Sweater CUNA Áo Sweater Nam Nữ Form Rộng Chất Cotton Nỉ Ngoại Hàng Xuất Cao Cấp Trơn Cổ Tròn Dài Tay Local Brand",10,1,2,1,2,2017.0,500,"Air Transportation","2022-05-10","2022-05-06","On Going");