#!/bin/bash

# This document needs sourced into your environment:
# 1) Adds the existing directory into your PATH
# 2) Alias individual scripts into 

# TODO:  Add current directory to PATH

# TODO:  Make an alias for each script

# Common functions used by the arithmetic scripts
error() {
    echo "$@" 1>&2
}

fail() {
    error "$@"
    exit 1
}

check_bc() {
    ls $(command -v bc) > /dev/null 2>&1
    echo $?
}

#Add aliases here:
alias addition='addition.sh'
alias add='addition.sh'
alias subtract='subtraction.sh'
alias multiply='multiply.sh'
alias divide='divide.sh'
