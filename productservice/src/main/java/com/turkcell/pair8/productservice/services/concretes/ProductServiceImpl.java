package com.turkcell.pair8.productservice.services.concretes;

import com.turkcell.pair8.productservice.entities.Cart;
import com.turkcell.pair8.productservice.entities.Product;
import com.turkcell.pair8.productservice.repositories.ProductRepository;
import com.turkcell.pair8.productservice.services.abstracts.ProductService;
import com.turkcell.pair8.productservice.services.dtos.cart.requests.AddCartRequest;
import com.turkcell.pair8.productservice.services.dtos.cart.requests.UpdateCartRequest;
import com.turkcell.pair8.productservice.services.dtos.product.requests.AddProductRequest;
import com.turkcell.pair8.productservice.services.dtos.product.requests.SearchProductRequest;
import com.turkcell.pair8.productservice.services.dtos.product.requests.UpdateProductRequest;
import com.turkcell.pair8.productservice.services.dtos.product.responses.AddProductResponse;
import com.turkcell.pair8.productservice.services.dtos.product.responses.SearchProductResponse;
import com.turkcell.pair8.productservice.services.mappers.CartMapper;
import com.turkcell.pair8.productservice.services.mappers.ProductMapper;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@Getter
@Setter
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;
    public Optional<Product> getProduct(String productID) {
        return productRepository.findByProductID(productID);
    }

    public void update(UpdateProductRequest request) {
        Product product = ProductMapper.INSTANCE.updateProductFromRequest(request);
        productRepository.save(product);
        //TODO: MESSAGES

    }

    @Override
    public SearchProductResponse getAll(SearchProductRequest request) {
        List<Product> products = productRepository.findAll();
        return ProductMapper.INSTANCE.responseFromSearchProduct(products);
    }

    public AddProductResponse add(AddProductRequest request){
        Product product = ProductMapper.INSTANCE.addProductRequest(request);
        productRepository.save(product);
        return ProductMapper.INSTANCE.responseFromAddProduct(product);
    }
}
