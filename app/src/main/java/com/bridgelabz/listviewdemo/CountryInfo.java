package com.bridgelabz.listviewdemo;

/**
 * Created by Nadimuddin on 7/9/16.
 */
public class CountryInfo
{
    int mRank,mImageId;
    String mCountry, mPopulation;

    //Constructor store country info
    CountryInfo(int rank, String country, String population, int imageId)
    {
        mRank = rank;
        mCountry = country;
        mPopulation = population;
        mImageId = imageId;
    }

    //method to return rank of country
    String getRank()
    {
        return Integer.toString(mRank);
    }

    //method to return name of country
    String getCountry()
    {
        return mCountry;
    }

    //method to return population of country
    String getPopulation()
    {
        return mPopulation;
    }

    //method to return resource id of image of country's flag
    int getImageId()
    {
        return mImageId;
    }

}
