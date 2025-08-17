package com.spring.boot.springbootjparelations1.Service;

import com.spring.boot.springbootjparelations1.Repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressService {
    private final AddressRepository addressRepository;

}
