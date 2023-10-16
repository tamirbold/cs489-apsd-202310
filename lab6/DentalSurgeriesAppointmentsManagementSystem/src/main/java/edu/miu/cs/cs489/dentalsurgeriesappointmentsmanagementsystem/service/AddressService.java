package edu.miu.cs.cs489.dentalsurgeriesappointmentsmanagementsystem.service;

import edu.miu.cs.cs489.dentalsurgeriesappointmentsmanagementsystem.models.Address;

import java.util.List;

public interface AddressService {
    public List<Address> getAllAddresses();
    public Address getAddressById(Long addressId);
    public Address updateAddress(Address address);
    public void deleteAddress(Address address);
    public Address addNewAddress(Address address);


}
