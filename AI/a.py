import pandas as pd 
import numpy as np 
import pickle 
import joblib
import streamlit as st 
from PIL import Image 
  
# loading in the model to predict on the data 
model = joblib.load('mj')
  
def welcome(): 
    return 'welcome all'
  
# defining the function which will make the prediction using  
# the data which the user inputs 
def prediction(area):   
   
    prediction = model.predict( 
        [[area]]) 
    print(prediction) 
    return prediction 
      
  
# this is the main function in which we define our webpage  
def main(): 
      # giving the webpage a title 
    st.title("Price Prediction") 
      
    # here we define some of the front end elements of the web page like  
    # the font and background color, the padding and the text to be displayed 
    html_temp = """ 
    <div style ="background-color:yellow;padding:13px"> 
    <h1 style ="color:black;text-align:center;"> ML App </h1> 
    </div> 
    """

    st.markdown(html_temp, unsafe_allow_html = True) 

    area = st.number_input("Area")
 
    result ="" 
      

    if st.button("Predict"): 
        result = prediction(area) 
    st.success('The output is {}'.format(result)) 
     
if __name__=='__main__': 
    main() 