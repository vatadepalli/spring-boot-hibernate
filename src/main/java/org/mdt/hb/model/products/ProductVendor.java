package org.mdt.hb.model.products;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
/**
 * ProductVendor
 */
@Entity
@Table(name = "product_vendor")
public class ProductVendor implements Serializable {
    /**
    *
    */
    @Transient
    private static final long serialVersionUID = 8220609632633982722L;

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Id
    @ManyToOne
    @JoinColumn(name = "vendor_id")
    private Vendor vendor;

    private Double vendorSpecificPrice;

}