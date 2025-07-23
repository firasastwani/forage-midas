# Install dependencies as needed:
# pip install kagglehub[pandas-datasets]
import kagglehub
from kagglehub import KaggleDatasetAdapter

# Set the path to the CSV file in the dataset (update if needed)
file_path = "credit_card_transactions.csv"  # Adjust this if the file name is different

# Load the latest version of the dataset as a pandas DataFrame
# See: https://github.com/Kaggle/kagglehub#kaggledatasetadapterpandas

df = kagglehub.load_dataset(
    KaggleDatasetAdapter.PANDAS,
    "priyamchoksi/credit-card-transactions-dataset",
    file_path,
    # You can add sql_query or pandas_kwargs here if needed
)



print("First 5 records:")
print(df.head())

# List of analytics-relevant columns to keep
analytics_columns = [
    "trans_date_trans_time", "unix_time", "cc_num", "amt", "category", "merchant", "is_fraud",
    "city", "state", "zip", "lat", "long", "merch_lat", "merch_long", "merch_zipcode",
    "trans_num", "gender", "dob", "job", "city_pop"
]

# Filter the DataFrame to only include these columns
filtered_df = df[analytics_columns]

# Save the filtered DataFrame to CSV (overwrite original or use a new file)
filtered_df.to_csv("credit_card_transactions.csv", index=False)

print("Filtered CSV saved with analytics-relevant columns only.")
print(filtered_df.head()) 
