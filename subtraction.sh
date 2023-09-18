#!/bin/bash
source ./arithmeticEnv.sh

help() {
    echo "$0 subtracts subsequent arguments from the first argument"
    echo -e "\nNo parameters are accepted other than for this help message"
    echo -e "\t -h, -?, --help"
    echo -e "\nThis script uses 'bc' by default, if installed."
    echo -e "This script supports decimals with 'bc"
    echo -e "If 'bc' is not installed and no decimals are found, then"
    echo -e "built-in bash arithmetic is used."
    echo -e "\n Ex:"
    echo -e "\t $0 3 1"
    echo -e "\t $0 3.33 1.11"
    exit 0
}

if [ $(echo $@ | grep -cE "\-h|\-\?|\-\-help") -gt 0 ]; then
    help
fi

bc=false;
if [ $(check_bc) == 0 ]; then
    bc=true;
fi

# Supports decimal numbers, but requires use of 'bc'
# If bc is installed, then use it 
if $bc; then
    total=$1
    shift
    for i in $@; do
        total=$(echo "$total - $i" | bc)
    done
    echo $total
    exit
fi

#if bc is not installed, fail if we find any decimal places
if [ $(echo $@ | tr -dc '.' | awk '{print length}') > 0 ]; then
    fail $0 requires the 'bc' command in order to support decimal values  
fi

#if bc is not installed and we have integers, then calculate value
total=$1
shift
for i in $@; do
    ((total=total-i))
done
echo $total