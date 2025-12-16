package pl.edu.vistula.first_rest_api_spring.product.service;

import org.springframework.stereotype.Service;
import pl.edu.vistula.first_rest_api_spring.product.api.request.ProductRequest;
import pl.edu.vistula.first_rest_api_spring.product.api.response.ProductResponse;
import pl.edu.vistula.first_rest_api_spring.product.domain.Product;
import pl.edu.vistula.first_rest_api_spring.product.repository.ProductRepository;
import pl.edu.vistula.first_rest_api_spring.product.support.exception.ProductExceptionSupplier;
import pl.edu.vistula.first_rest_api_spring.product.support.ProductMapper;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    // Constructor Injection: Spring automatically provides the Repository and Mapper
    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public ProductResponse create(ProductRequest productRequest) {
        // 1. Convert Request to Entity
        Product product = productMapper.toProduct(productRequest);

        // 2. Save Entity to "Database"
        productRepository.save(product);

        // 3. Convert saved Entity (now with ID) to Response and return it
        return productMapper.toProductResponse(product);
    }

    public ProductResponse find(Long id) {
        Product product = productRepository.findById(id).orElseThrow(ProductExceptionSupplier.productNotFound(id));
        return productMapper.toProductResponse(product);
    }
}
