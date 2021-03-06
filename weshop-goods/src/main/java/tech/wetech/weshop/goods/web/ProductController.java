package tech.wetech.weshop.goods.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.api.BaseApi;
import tech.wetech.weshop.goods.api.ProductApi;
import tech.wetech.weshop.goods.po.Product;

@RequestMapping("/product")
@RestController
public class ProductController extends BaseApi<Product> implements ProductApi {
}
