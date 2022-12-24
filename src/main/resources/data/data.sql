use triple;

set @user_id = uuid_to_bin(3ede0ef2-92b7-a5f3-0c575361f745);

insert into users
        (id, reg_date, mod_date, name, password, tel)
values (@user_id, now(), now(), 'John', '1111', '010-0000-0000')