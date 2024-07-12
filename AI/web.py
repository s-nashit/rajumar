import streamlit as st
import pandas as pd
import matplotlib.pyplot as plt
# import pillow as pil

st.title('My DA/ML Web aPP')
# st.subheader('Data Set')
st.success('Data sETS')

# a = st.text_input('Name')

df = pd.read_csv('p.csv')

# st.dataframe(df)
fig = plt.figure()
plt.plot(df)
st.pyplot(fig)

# AI : https://teams.microsoft.com/l/meetup-join/19%3ameeting_OGI5NzEwMmYtOGNmYi00ZDE4LWE0OWYtM2IyYjVhMDQzNjA5%40thread.v2/0?context=%7b%22Tid%22%3a%22ad06ef22-d6dc-4a55-b4c1-c3a158f5f147%22%2c%22Oid%22%3a%22f5189c02-948d-412e-b57d-ddba1481ffc7%22%7d
# FSD: https://teams.microsoft.com/l/meetup-join/19%3ameeting_NmRjNGRjMTgtMGNjMC00ZGExLWFjMzgtNzk1ZTQ4YmNjM2Fi%40thread.v2/0?context=%7b%22Tid%22%3a%22ad06ef22-d6dc-4a55-b4c1-c3a158f5f147%22%2c%22Oid%22%3a%22f5189c02-948d-412e-b57d-ddba1481ffc7%22%7d