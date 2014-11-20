package com.rcd.model.recommender;

import java.io.File;
import java.util.List;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.recommender.CachingRecommender;
import org.apache.mahout.cf.taste.impl.recommender.slopeone.SlopeOneRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.similarity.ItemSimilarity;

public class MySlopeOneRecommender {
	public List<RecommendedItem> mySlopeOneRecommender(long userID,int size){
		List<RecommendedItem> recommendations = null;
		try {
			DataModel model = new FileDataModel(new File("/Users/mangohero1985/Documents/svnCheckout/MahoutTaste/ml-1m/ratingsNoTime.txt"));//构造数据模型
			Recommender recommender = new CachingRecommender(new SlopeOneRecommender(model));//构造推荐引擎
			recommendations = recommender.recommend(userID, size);//得到推荐结果
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return recommendations;
	}

}
