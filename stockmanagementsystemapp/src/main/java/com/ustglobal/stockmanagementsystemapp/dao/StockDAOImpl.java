package com.ustglobal.stockmanagementsystemapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.stockmanagementsystemapp.dto.ProductBean;

@Repository
public class StockDAOImpl implements IStockDAO {

	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

	@Override
	public ProductBean searchByName(String name) {
		String jpql = "from ProductBean where name = :name";
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		TypedQuery<ProductBean> typedQuery = entityManager.createQuery(jpql, ProductBean.class);
		typedQuery.setParameter("name", name);
		return typedQuery.getSingleResult();
	}

	@Override
	public List<ProductBean> searchByCategory(String category) {
		String jpql = "from ProductBean where category = :category";
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		TypedQuery<ProductBean> typedQuery = entityManager.createQuery(jpql, ProductBean.class);
		typedQuery.setParameter("category", category);
		return typedQuery.getResultList();
	}

	@Override
	public List<ProductBean> searchByCompany(String company) {
		String jpql = "from ProductBean where company = :company";
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		TypedQuery<ProductBean> typedQuery = entityManager.createQuery(jpql, ProductBean.class);
		typedQuery.setParameter("company", company);
		return typedQuery.getResultList();
	}

	@Override
	public boolean addProduct(ProductBean productBean) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		try {

			entityTransaction.begin();
			entityManager.persist(productBean);
			entityTransaction.commit();
			return true;

		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
			
		}
	}

	@Override
	public boolean updateProduct(ProductBean productBean) {
		String jpql = "from ProductBean where id = :id";
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		TypedQuery<ProductBean> typedQuery = entityManager.createQuery(jpql, ProductBean.class);
		typedQuery.setParameter("id", productBean.getId());
		ProductBean bean = typedQuery.getSingleResult();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		try {
			
			entityTransaction.begin();
			bean.setName(productBean.getName());
			bean.setCategory(productBean.getCategory());
			bean.setCompany(productBean.getCompany());
			bean.setPrice(productBean.getPrice());
			bean.setQuantity(productBean.getQuantity());
			entityTransaction.commit();
			return true;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
			
		}
	}

	@Override
	public boolean addToCart(ProductBean productBean, int itemCount) {
		String jpql = "update ProductBean set quantity = :quantity - :itemCount where id = :id" ;
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		ProductBean bean = entityManager.find(ProductBean.class, productBean.getId());
		TypedQuery<ProductBean> typedQuery = entityManager.createQuery(jpql, ProductBean.class);
		typedQuery.setParameter("quantity", bean.getQuantity());
		typedQuery.setParameter("itemCount", productBean.getQuantity());
		typedQuery.setParameter("id", productBean.getId());
		ProductBean bean2 = typedQuery.getSingleResult();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		try {
			
			entityTransaction.begin();
			bean.setQuantity(bean2.getQuantity());
			entityTransaction.commit();
			return true;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
			
		}
		
	}

}
