package org.mdt.hb.repository.products;

import org.mdt.hb.model.products.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * VendorRepository
 */
@Repository
public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}